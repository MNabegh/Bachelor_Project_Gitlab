clc
clear all 
close all


Reading = csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/FinalDecision.csv"),1,2,[1 2 4000 2]);
Trust = csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/FinalDecision.csv"),1,3,[1 3 4000 3]);

Reading = transpose(Reading);
Trust = transpose(Trust);

range = [1650:1750];

plot(Reading(range));
title('Final Reading for the first 200 hours');
hold on
plot(25, 'r');
figure
plot(Trust(range),'g')

% 1692 trust drop