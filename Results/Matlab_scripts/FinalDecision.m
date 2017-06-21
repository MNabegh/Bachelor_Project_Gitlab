clc
clear all 
close all


Reading = csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/FinalDecision.csv"),1,2,[1 2 4500 2]);
Trust = csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/FinalDecision.csv"),1,3,[1 3 4500 3]);
Reading2 = csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecisionAttacker/FinalDecision.csv"),1,2,[1 2 4500 2]);
Trust2 = csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecisionAttacker/FinalDecision.csv"),1,3,[1 3 4500 3]);


Reading = transpose(Reading);
Trust = transpose(Trust);
Reading = transpose(Reading);
Trust = transpose(Trust);


range = [2332:4500];
find(Reading(range) - Reading2(range)==0)


plot(Reading(range));
hold on
plot(Reading2(range));
title('Final Reading for the first 200 hours');
figure
plot(Trust(range))
hold on
plot(Trust2(range))

% 1692 trust drop