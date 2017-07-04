clc
clear all 
close all

sensor = "255";



Sensor255 = csvread(strcat("/home/nabegh/Bachelor/Results/Trust/255.csv"),2295,4,[2295 4 2295 4]);
Sensor1002 = csvread(strcat("/home/nabegh/Bachelor/Results/Trust/1002.csv"),2108,4,[2108 4 2108 4]);
Sensor1178 = csvread(strcat("/home/nabegh/Bachelor/Results/Trust/1178.csv"),2105,4,[2105 4 2105 4]);
Sensor1098 = csvread(strcat("/home/nabegh/Bachelor/Results/Trust/1098.csv"),2219,4,[2219 4 2219 4]);
Sensor2394 = csvread(strcat("/home/nabegh/Bachelor/Results/Trust/2394.csv"),967,4,[967 4 967 4]);
Sensor481 = csvread(strcat("/home/nabegh/Bachelor/Results/Trust/481.csv"),2329,4,[2329 4 2329 4]);
Sensor1973 = csvread(strcat("/home/nabegh/Bachelor/Results/Trust/1973.csv"),989,4,[989 4 989 4]);
Sensor1286 = csvread(strcat("/home/nabegh/Bachelor/Results/Trust/1286.csv"),2061,4,[2061 4 2061 4]);
Sensor1462 = csvread(strcat("/home/nabegh/Bachelor/Results/Trust/1462.csv"),1733,4,[1733 4 1733 4]);
Sensor2630 = csvread(strcat("/home/nabegh/Bachelor/Results/Trust/2630.csv"),801,4,[801 4 801 4]);

Z = [Sensor481 Sensor1973 Sensor1286 Sensor1462 Sensor2630 Sensor1002 Sensor1098 Sensor1178 Sensor2394 Sensor255]
X = [48.442 48.392 48.385 48.41 48.413 48.399 48.397 48.408 48.412 48.397 ]; 
Y = [9.997 9.96 9.947 9.934 9.952 9.993 10.01 10.004 10.006 9.99 ];

output = [X;Y;Z];

stem3(X,Y,Z)
