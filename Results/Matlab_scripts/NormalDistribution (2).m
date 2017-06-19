clc
clear all 
close all


Reading = csvread(strcat('/home/nabegh/Bachelor/Results/Trust/FinalDecision/FinalDecision.csv'),4400,2,[4400 2 4586 2]);


%Reading = transpose(Reading);




pd = fitdist(Reading,'Normal')

x_values = -30:1:80;
y = pdf(pd,x_values);
plot(x_values,y,'LineWidth',2)
hold on
x1 = mean(pd);
y1=0:0.01:0.05;
plot(x1*ones(size(y1)), y1, 'LineWidth', 1)

hold on
x2 = x1+std(pd);
y2=0:0.01:0.05;
plot(x2*ones(size(y2)), y2,'g', 'LineWidth', 1)

hold on
x3 = x1-std(pd);
y3=0:0.01:0.05;
plot(x3*ones(size(y2)), y2,'g', 'LineWidth', 1)

title('final data distribution')

