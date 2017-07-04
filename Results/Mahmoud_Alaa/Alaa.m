clc
clear all
close all


%% Reading the CSV File


File = csvread("/home/nabegh/Bachelor/Results/Mahmoud_Alaa/re/agg35.csv",1,1);
File=transpose(File);

%% Plotting 

t=[0:16];


b=bar(t,File);
set(b(2),'facecolor','r');

xlabel('time');
ylabel('score');




x=ones(1,20).*1;
z=[-1:18];
hold on 
plot(z,x,'--k');

legend('Aggresive driver','Normal driver','Threshold');
