clc
close all
clear all

%% Reading the Data

sensors = [1002, 1178, 1098, 2394,255,481,1973,1286,1462,2630,3323];
succ = 0;
fails = 0;

for i=1:length(sensors)
   display(strcat("sensor",num2str(sensors(i)),"=csvread(strcat(/home/nabegh/Bachelor/FineDustMeasurementsNew/2017-07-11_sds011_sensor_",num2str(sensors(i)),".csv")) 
end

%% 

for j=10:30
    
    
    sensor1002=csvread(strcat("/home/nabegh/Bachelor/FineDustMeasurementsNew/2017-06-",j,"_sds011_sensor_1002.csv"));
    sensor1178=csvread(strcat("/home/nabegh/Bachelor/FineDustMeasurementsNew/2017-06-",j,"_sds011_sensor_1178.csv"));
    sensor1098=csvread(strcat("/home/nabegh/Bachelor/FineDustMeasurementsNew/2017-06-",j,"_sds011_sensor_1098.csv"));
    sensor2394=csvread(strcat("/home/nabegh/Bachelor/FineDustMeasurementsNew/2017-06-",j,"_sds011_sensor_2394.csv"));
    sensor255=csvread(strcat("/home/nabegh/Bachelor/FineDustMeasurementsNew/2017-06-",j,"_sds011_sensor_255.csv"));
    sensor481=csvread(strcat("/home/nabegh/Bachelor/FineDustMeasurementsNew/2017-06-",j,"_sds011_sensor_481.csv"));
    sensor1973=csvread(strcat("/home/nabegh/Bachelor/FineDustMeasurementsNew/2017-06-",j,"_sds011_sensor_1973.csv"));
    sensor1286=csvread(strcat("/home/nabegh/Bachelor/FineDustMeasurementsNew/2017-06-",j,"_sds011_sensor_1286.csv"));
    sensor1462=csvread(strcat("/home/nabegh/Bachelor/FineDustMeasurementsNew/2017-06-",j,"_sds011_sensor_1462.csv"));
    sensor2630=csvread(strcat("/home/nabegh/Bachelor/FineDustMeasurementsNew/2017-06-",j,"_sds011_sensor_2630.csv"));
    sensor3323=csvread(strcat("/home/nabegh/Bachelor/FineDustMeasurementsNew/2017-06-",j,"_sds011_sensor_3323.csv"));
           
    
end
