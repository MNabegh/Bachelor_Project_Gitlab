clc
clear all 
close all


Reading = csvread(strcat("/home/nabegh/Bachelor/Results/Trust/1286.csv"),390,3,[390 3 400 3])

pd = fitdist(Reading,'Normal')

x_values = -30:1:60;
y = pdf(pd,x_values);
plot(x_values,y,'LineWidth',2)
hold on
x1 = mean(pd);
y1=0:0.01:1;
plot(x1*ones(size(y1)), y1, 'LineWidth', 1)

hold on
x2 = x1+std(pd);
y2=0:0.01:1;
plot(x2*ones(size(y2)), y2,'g', 'LineWidth', 1)

hold on
x3 = x1-std(pd);
y3=0:0.01:1;
plot(x3*ones(size(y2)), y2,'g', 'LineWidth', 1)

title('final data distribution')

