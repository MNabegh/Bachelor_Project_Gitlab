clc
clear all 
close all


Sensor255 = csvread(strcat("/home/nabegh/Bachelor/Results/Trust/255.csv"),2295,3,[2295 3 2295 3]);
Sensor1002 = csvread(strcat("/home/nabegh/Bachelor/Results/Trust/1002.csv"),2108,3,[2108 3 2108 3]);
Sensor1178 = csvread(strcat("/home/nabegh/Bachelor/Results/Trust/1178.csv"),2105,3,[2105 3 2105 3]);
Sensor1098 = csvread(strcat("/home/nabegh/Bachelor/Results/Trust/1098.csv"),2219,3,[2219 3 2219 3]);
Sensor2394 = csvread(strcat("/home/nabegh/Bachelor/Results/Trust/2394.csv"),967,3,[967 3 967 3]);
Sensor481 = csvread(strcat("/home/nabegh/Bachelor/Results/Trust/481.csv"),2329,3,[2329 3 2329 3]);
Sensor1973 = csvread(strcat("/home/nabegh/Bachelor/Results/Trust/1973.csv"),989,3,[989 3 989 3]);
Sensor1286 = csvread(strcat("/home/nabegh/Bachelor/Results/Trust/1286.csv"),2061,3,[2061 3 2061 3]);
Sensor1462 = csvread(strcat("/home/nabegh/Bachelor/Results/Trust/1462.csv"),1733,3,[1733 3 1733 3]);
Sensor2630 = csvread(strcat("/home/nabegh/Bachelor/Results/Trust/2630.csv"),801,3,[801 3 801 3]);

Reading = [Sensor481 Sensor1973 Sensor1286 Sensor1462 Sensor2630 Sensor1002 Sensor1098 Sensor1178 Sensor2394 Sensor255];


Reading = transpose(Reading)




pd = fitdist(Reading,'Normal')

x_values = -30:1:60;
y = pdf(pd,x_values);
plot(x_values,y,'LineWidth',2)
hold on
x1 = mean(pd);
y1=0:0.01:1;
plot(x1*ones(size(y1)), y1, 'LineWidth', 1)

hold on
x2 = x1+1.5*std(pd);
y2=0:0.01:1;
plot(x2*ones(size(y2)), y2,'g', 'LineWidth', 1)

hold on
x3 = x1-1.5*std(pd);
y3=0:0.01:1;
plot(x3*ones(size(y2)), y2,'g', 'LineWidth', 1)

title('final data distribution')

