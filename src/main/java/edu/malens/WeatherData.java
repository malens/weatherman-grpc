package edu.malens;

import edu.malens.grpc.*;
import edu.malens.grpc.Date;

import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class WeatherData {
    private static WeatherData dataInstance = new WeatherData();

    private Random random = new Random();

    private static final Logger logger = Logger.getLogger(WeatherData.class.getName());

    public static WeatherData getInstance(){
        return dataInstance;
    }

    private final HashMap<String, HashMap<Date, WeatherDay>> weather = new HashMap<>();

    private final HashMap<String, LinkedList<BlockingQueue<WeatherResponse>>> queues = new HashMap<>();

    private WeatherData(){
        this.weather.put("Cracow", new HashMap<>());
        this.weather.put("London", new HashMap<>());
        this.weather.put("Warsaw", new HashMap<>());
        this.weather.put("Paris", new HashMap<>());
        this.weather.put("Moscow", new HashMap<>());
        this.weather.put("Berlin", new HashMap<>());
        weather.keySet().forEach(k -> {
            queues.put(k, new LinkedList<>());
        });
        logger.info("XD");
        this.weather.keySet().parallelStream().forEach(city -> new Thread(() -> updateWeather(city)).start());
    }

    private WeatherDay buildWeatherDay(WeatherState state, LocalDate date){
        return WeatherDay
                .newBuilder()
                .setDate(buildDate(date))
                .setState(state)
                .build();
    }


    public WeatherResponse getWeather(String city, List<Date> dates){
        synchronized (weather){
            return buildWeatherResponse(city, this.weather.get(city).values().parallelStream().filter(w -> dates.contains(w.getDate())).collect(Collectors.toSet()));
        }
    }


    private WeatherResponse buildWeatherResponse(String city, Collection<WeatherDay> weatherDays){
        return WeatherResponse
                .newBuilder()
                .addAllWeather(weatherDays)
                .setCity(city)
                .build();
    }

    private Date buildDate (LocalDate date){
        return buildDate(date.getDayOfMonth(), date.getMonthValue(), date.getYear());
    }

    private Date buildDate (int day, int month, int year){
        return Date
                .newBuilder()
                .setDay(day)
                .setMonth(month)
                .setYear(year)
                .build();
    }

    public Set<WeatherResponse> getAllWeather(){
        synchronized (weather){
            return weather.entrySet().parallelStream().map(e -> buildWeatherResponse(e.getKey(), e.getValue().values())).collect(Collectors.toSet());
        }
    }

    public BlockingQueue<WeatherResponse> subscribe(String city){
        BlockingQueue<WeatherResponse> queue = new LinkedBlockingDeque<>();
        synchronized (queues){
            queues.get(city).add(queue);
        }
        return queue;
    }

    private void updateWeather(String city){
        System.err.println("started updating weather");
        System.err.flush();
        while (true) {
            try {
                Thread.sleep(50 + random.nextInt(50));
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            HashMap<Date, WeatherDay> temp = new HashMap<>();
            for (LocalDate date = LocalDate.now(); date.isBefore(LocalDate.now().plusDays(7)); date = date.plusDays(1)){
                temp.put(buildDate(date), buildWeatherDay(WeatherState.forNumber(random.nextInt(4)), date));
            }
            synchronized(weather){
                weather.get(city).clear();
                weather.get(city).putAll(temp);
            }

            synchronized (queues){
                queues.get(city).forEach(q -> {
                    try {
                        q.put(buildWeatherResponse(city, temp.values()));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
            }

        }
    }


}
