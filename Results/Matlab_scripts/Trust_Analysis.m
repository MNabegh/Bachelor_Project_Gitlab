clc
clear all 
close all



sensor = "255";

Trust = csvread(strcat("/home/nabegh/Bachelor/Results/Trust/",sensor,".csv"),1,4,[1 4 2223 4]);
SensorReading = csvread(strcat("/home/nabegh/Bachelor/Results/Trust/",sensor,".csv"),1,3,[1 3 2223 3]);
finalReading = csvread(strcat("/home/nabegh/Bachelor/Results/Trust/",sensor,".csv"),1,9,[1 9 2223 9]);

range = [1:200];

hold on

Trust=transpose(Trust);
SensorReading = transpose(SensorReading);
finalReading = transpose(finalReading);
count = 0;
plot(Trust(range));
title('Sensor Trust for the first 200 hours');
figure
plot(SensorReading(range))
hold on
plot(finalReading(range),'r')
title('Readings for the first 200 hours');
legend('Sensor Readings','Cumulative Readings');