clc 
clear all
close all

%% Data Extracting 

normal = csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/First/FinalDecision.csv"),1,0);
attack1_11 =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/First/FinalDecision1_11.csv"),1,0);
attack2_11 =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/First/FinalDecision2_11.csv"),1,0);
attack3_11 =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/First/FinalDecision3_11.csv"),1,0);
attack4_11 =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/First/FinalDecision4_11.csv"),1,0);
attack5_11 =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/First/FinalDecision5_11.csv"),1,0);
attack6_11 =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/First/FinalDecision6_11.csv"),1,0);

normal = transpose(normal(:,3));
attack_1=transpose(attack1_11(:,3));
attack_2=transpose(attack2_11(:,3));
attack_3=transpose(attack3_11(:,3));
attack_4=transpose(attack4_11(:,3));
attack_5=transpose(attack5_11(:,3));
attack_6=transpose(attack6_11(:,3));

%% RMSE

x= [0 1/11 2/11 3/11 4/11 5/11 6/11 ];
y1= [RMSE(normal,normal) RMSE(attack_1,normal) RMSE(attack_2,normal) RMSE(attack_3,normal) RMSE(attack_4,normal) RMSE(attack_5,normal) RMSE(attack_6,normal)]

