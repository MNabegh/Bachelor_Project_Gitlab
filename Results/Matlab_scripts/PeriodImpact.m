clc 
clear all
close all

%% Looping

types = ["Clever-Constant_+50" "Clever-Constant_+200"];% "Random-Constant" "Clever-Constant_+15" "Clever-Constant_+50"
Frequency = [6 12 18 24];
Attackers = ["AttackersRatio1_11" "AttackersRatio2_11" "AttackersRatio3_11" "AttackersRatio4_11" "AttackersRatio5_11" "AttackersRatio6_11"];

deca = "0.9";
plotStyle = {'rx','bo','gd', 'k*'};
x= [0 1 2 3 4 5];

for k=1:length(Attackers)
for i=1:length(types)
    figure
for j=1:length(Frequency)
%% Data Extracting 

normal = csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Decay_",deca,"/First/FinalDecision.csv"),1,0);
Period1 =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Decay_",deca,"/First/",types(i),"/Frequency",int2str(Frequency(j)),"/",Attackers(k),"/Period1.csv"),1,0);
Period2 =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Decay_",deca,"/First/",types(i),"/Frequency",int2str(Frequency(j)),"/",Attackers(k),"/Period2.csv"),1,0);
Period3 =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Decay_",deca,"/First/",types(i),"/Frequency",int2str(Frequency(j)),"/",Attackers(k),"/Period3.csv"),1,0);
Period4 =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Decay_",deca,"/First/",types(i),"/Frequency",int2str(Frequency(j)),"/",Attackers(k),"/Period4.csv"),1,0);
Period5 =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Decay_",deca,"/First/",types(i),"/Frequency",int2str(Frequency(j)),"/",Attackers(k),"/Period5.csv"),1,0);

normal = transpose(normal(:,3));
Period1=transpose(Period1(:,3));
Period2=transpose(Period2(:,3));
Period3=transpose(Period3(:,3));
Period4=transpose(Period4(:,3));
Period5=transpose(Period5(:,3));


%% RMSE
hold on

y1= [0 RMSE2(Period1,normal,1,Frequency(j)) RMSE2(Period2,normal,2,Frequency(j)) RMSE2(Period3,normal,3,Frequency(j)) RMSE2(Period4,normal,4,Frequency(j)) RMSE2(Period5,normal,5,Frequency(j))];
sz = 100;
scatter(x,y1,sz,plotStyle{j});
legendInfo{j} = ['Frequency= ' int2str(Frequency(j))];

end
legend(legendInfo,'Location','northwest','FontSize',24);
end
end

for k=1:length(Attackers)
for i=1:length(types)
    figure
for j=1:length(Frequency)
%% Data Extracting 

normal = csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Decay_",deca,"/FinalDecision.csv"),1,0);
Period1 =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Decay_",deca,"/",types(i),"/Frequency",int2str(Frequency(j)),"/",Attackers(k),"/Period1.csv"),1,0);
Period2 =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Decay_",deca,"/",types(i),"/Frequency",int2str(Frequency(j)),"/",Attackers(k),"/Period2.csv"),1,0);
Period3 =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Decay_",deca,"/",types(i),"/Frequency",int2str(Frequency(j)),"/",Attackers(k),"/Period3.csv"),1,0);
Period4 =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Decay_",deca,"/",types(i),"/Frequency",int2str(Frequency(j)),"/",Attackers(k),"/Period4.csv"),1,0);
Period5 =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Decay_",deca,"/",types(i),"/Frequency",int2str(Frequency(j)),"/",Attackers(k),"/Period5.csv"),1,0);

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

scatter(x,y2,sz,plotStyle{j});
legendInfo{j} = ['Frequency= ' int2str(Frequency(j))];



end
legend(legendInfo,'Location','northwest','FontSize',24);
end
end