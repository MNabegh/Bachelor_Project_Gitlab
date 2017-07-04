clc
clear all
close all


%% Reading the CSV File

File = csvread("/home/nabegh/Bachelor/Results/Mahmoud_Alaa/table.csv",1,1);
File=transpose(File);

%% Plotting 

t=[0:16];


b=bar(t,File);
set(b(2),'facecolor','r');

xlabel('time');
ylabel('score');

legend('vechile 1','veichle 2');

x=ones(1,20).*0.57;
z=[-1:18];
hold on 
plot(z,x,'--k');