clc
clear all 
close all

s = [255,1098];
size = 240;
day = "2017-06-01";

for i=1:length(s)

Trust = csvread(strcat("/home/nabegh/Bachelor/Results/Trust/",day,".csv"),1,4,[1 4 size 4]);
SensorReading = csvread(strcat("/home/nabegh/Bachelor/Results/Trust/",day,".csv"),1,3,[1 3 size 3]);
finalReading = csvread(strcat("/home/nabegh/Bachelor/Results/Trust/",day,".csv"),1,9,[1 9 size 9]);
Sensors = csvread(strcat("/home/nabegh/Bachelor/Results/Trust/",day,".csv"),1,2,[1 2 size 2]);
range = find(Sensors == s(i));



hold on
plot(SensorReading(range))

end
hold on
plot(finalReading(range))

figure 

for i=1:length(s)

Trust = csvread(strcat("/home/nabegh/Bachelor/Results/Trust/",day,".csv"),1,4,[1 4 size 4]);
SensorReading = csvread(strcat("/home/nabegh/Bachelor/Results/Trust/",day,".csv"),1,3,[1 3 size 3]);
finalReading = csvread(strcat("/home/nabegh/Bachelor/Results/Trust/",day,".csv"),1,9,[1 9 size 9]);
Sensors = csvread(strcat("/home/nabegh/Bachelor/Results/Trust/",day,".csv"),1,2,[1 2 size 2]);
range = find(Sensors == s(i));


hold on

Trust=transpose(Trust);
count = 0;
plot(Trust(range));
title('Sensor Trust for the first 200 hours');


end