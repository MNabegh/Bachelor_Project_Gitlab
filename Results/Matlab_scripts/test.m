clc
clear all
close all

normal = csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/FinalDecision.csv"),1,0);
normal2 = csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/First/FinalDecision.csv"),1,0);
nomral = normal(:,3)
nomral2 = normal2(:,3)
RMSE(transpose(normal),transpose(normal2))

