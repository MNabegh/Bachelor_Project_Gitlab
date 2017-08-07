clc 
clear all
close all

%% Looping

types = ["Random-Constant" "Clever-Constant_+5" "Clever-Constant_+10" "Clever-Constant_+15" "Clever-Constant_+50" "Clever-Constant_+200"]; % "Random-Constant" "Clever-Constant_+15" "Clever-Constant_+50"
deca = "0.9"; 

for i=1:6
    figure
    clear c1 c2
    for j=1:3
%% Data Extracting 

j=num2str(j);

normal = csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Continuous_Attacks/Run_",j,"/Decay_",deca,"/First/FinalDecision.csv"),1,0);
attack1_11 =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Continuous_Attacks/Run_",j,"/Decay_",deca,"/First/",types(i),"/FinalDecision1_11.csv"),1,0);
attack2_11 =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Continuous_Attacks/Run_",j,"/Decay_",deca,"/First/",types(i),"/FinalDecision2_11.csv"),1,0);
attack3_11 =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Continuous_Attacks/Run_",j,"/Decay_",deca,"/First/",types(i),"/FinalDecision3_11.csv"),1,0);
attack4_11 =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Continuous_Attacks/Run_",j,"/Decay_",deca,"/First/",types(i),"/FinalDecision4_11.csv"),1,0);
attack5_11 =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Continuous_Attacks/Run_",j,"/Decay_",deca,"/First/",types(i),"/FinalDecision5_11.csv"),1,0);
attack6_11 =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Continuous_Attacks/Run_",j,"/Decay_",deca,"/First/",types(i),"/FinalDecision6_11.csv"),1,0);

normal = transpose(normal(:,3));
attack_1=transpose(attack1_11(:,3));
attack_2=transpose(attack2_11(:,3));
attack_3=transpose(attack3_11(:,3));
attack_4=transpose(attack4_11(:,3));
attack_5=transpose(attack5_11(:,3));
attack_6=transpose(attack6_11(:,3));

%% RMSE
j=str2num(j);

x= [0 1/11 2/11 3/11 4/11 5/11 6/11 ];
y1(j,:)= [0 RMSE(attack_1,normal) RMSE(attack_2,normal) RMSE(attack_3,normal) RMSE(attack_4,normal) RMSE(attack_5,normal) RMSE(attack_6,normal)];
sz = 100;



%% Data Extracting 
j=num2str(j);
normal = csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Continuous_Attacks/Run_",j,"/Decay_",deca,"/FinalDecision.csv"),1,0);
attack1_11 =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Continuous_Attacks/Run_",j,"/Decay_",deca,"/",types(i),"/FinalDecision1_11.csv"),1,0);
attack2_11 =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Continuous_Attacks/Run_",j,"/Decay_",deca,"/",types(i),"/FinalDecision2_11.csv"),1,0);
attack3_11 =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Continuous_Attacks/Run_",j,"/Decay_",deca,"/",types(i),"/FinalDecision3_11.csv"),1,0);
attack4_11 =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Continuous_Attacks/Run_",j,"/Decay_",deca,"/",types(i),"/FinalDecision4_11.csv"),1,0);
attack5_11 =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Continuous_Attacks/Run_",j,"/Decay_",deca,"/",types(i),"/FinalDecision5_11.csv"),1,0);
attack6_11 =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Continuous_Attacks/Run_",j,"/Decay_",deca,"/",types(i),"/FinalDecision6_11.csv"),1,0);

normal = transpose(normal(:,3));
attack_1=transpose(attack1_11(:,3));
attack_2=transpose(attack2_11(:,3));
attack_3=transpose(attack3_11(:,3));
attack_4=transpose(attack4_11(:,3));
attack_5=transpose(attack5_11(:,3));
attack_6=transpose(attack6_11(:,3));

%% RMSE
j=str2num(j);

y2(j,:)= [0 RMSE(attack_1,normal) RMSE(attack_2,normal) RMSE(attack_3,normal) RMSE(attack_4,normal) RMSE(attack_5,normal) RMSE(attack_6,normal)];


    end
%% Multiple Runs Handling

fails2 = y2 == -10;

yf2(1) = 0;
yf2(2) = mean(y2(~fails2(:,2),2));
yf2(3) = mean(y2(~fails2(:,3),3));
yf2(4) = mean(y2(~fails2(:,4),4));
yf2(5) = mean(y2(~fails2(:,5),5));
yf2(6) = mean(y2(~fails2(:,6),6));
yf2(7) = mean(y2(~fails2(:,7),7));

fails2 = sum(fails2);



%% Plotting

dx = 0.02;
dy = 0;
y1 = mean(y1);

scatter(x,y1,sz,'x');


hold on

scatter(x,yf2,sz);


for k =1:7
text(x(k)+dx,yf2(k)+dy,strcat(num2str(fails2(k)),"/5"),'Color','r')
end

if i~=1
    title(strcat(strcat("Decay-",deca," "),types(i)));
else 
    title(types(i));
end
xlabel('attackers to nodes ratio');
ylabel('root mean square error');
legend({'constant multiplier','variable multiplier'},'Location','northwest','FontSize',24);

y1 = [];
y2 = [];
end