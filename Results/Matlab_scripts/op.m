close all
clear all
clc

%% 

types = ["Clever-Constant_+50" "Clever-Constant_+200"];% "Random-Constant" "Clever-Constant_+15" "Clever-Constant_+50"
Frequency = [6 12 18 24];
Attackers = ["AttackersRatio1_11" "AttackersRatio2_11" "AttackersRatio3_11" "AttackersRatio4_11" "AttackersRatio5_11" "AttackersRatio6_11"];
Decays = ["0.975" "0.9" "0.8" "0.7" "0.6" "0.5"];
count= 0;
sz = 100;
x= [0 1 2 3 4 5];
plotStyle = {'rx','bo','gd', 'k*'};
deca = "0.9";


figure
count = count+1;
for j=1:length(Frequency)
%% Data Extracting 

normal = csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Periodic_Attacks/Decay_",deca,"/FinalDecision.csv"),1,0);
Period1 =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Periodic_Attacks/Decay_",deca,"/Clever-Constant_+50/Frequency",int2str(Frequency(j)),"/","AttackersRatio3_11","/Period1.csv"),1,0);
Period2 =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Periodic_Attacks/Decay_",deca,"/","Clever-Constant_+50","/Frequency",int2str(Frequency(j)),"/","AttackersRatio3_11","/Period2.csv"),1,0);
Period3 =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Periodic_Attacks/Decay_",deca,"/","Clever-Constant_+50","/Frequency",int2str(Frequency(j)),"/","AttackersRatio3_11","/Period3.csv"),1,0);
Period4 =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Periodic_Attacks/Decay_",deca,"/","Clever-Constant_+50","/Frequency",int2str(Frequency(j)),"/","AttackersRatio3_11","/Period4.csv"),1,0);
Period5 =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Periodic_Attacks/Decay_",deca,"/","Clever-Constant_+50","/Frequency",int2str(Frequency(j)),"/","AttackersRatio3_11","/Period5.csv"),1,0);

normal = transpose(normal(:,3));
Period1=transpose(Period1(:,3));
Period2=transpose(Period2(:,3));
Period3=transpose(Period3(:,3));
Period4=transpose(Period4(:,3));
Period5=transpose(Period5(:,3));
%% RMSE

y2= [0 RMSE2(Period1,normal,1,Frequency(j)) RMSE2(Period2,normal,2,Frequency(j)) RMSE2(Period3,normal,3,Frequency(j)) RMSE2(Period4,normal,4,Frequency(j)) RMSE2(Period5,normal,5,Frequency(j))];

%% Plotting
hold on

figures(count) = scatter(x,y2,sz,plotStyle{j});
if Frequency(j) == 18
legendInfo{j} = ['Frequency= 4/3'];    
else
legendInfo{j} = ['Frequency= ' int2str(24/Frequency(j))];
end
xlabel('Period length')
ylabel('RMSE')

end
legend(legendInfo,'Location','northwest','FontSize',24);
titles{count}=(strcat('/home/nabegh/Bachelor/Results/Graphs/Continuous_Attack/Peridoic_data/Decay_',deca,' ',"Clever-Constant_50",' ',"AttackersRatio3_11"));
legend(legendInfo,'Location','northeast','FontSize',24);


%% Figutrs Printing
h= figures;
for i=1:length(h)
  print(char(strrep(titles{i},".","-")) ,'-dpdf','-bestfit')
end