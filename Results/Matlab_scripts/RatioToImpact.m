clc 
clear all
close all

%% Looping

types = ["Random-Constant" "Clever-Constant_+5" "Clever-Constant_+10" "Clever-Constant_+15" "Clever-Constant_+50" "Clever-Constant_+200"];
cc = {'Random-Constant', 'Clever-Constant_+5', 'Clever-Constant_+10', 'Clever-Constant_+15', 'Clever-Constant_+50', 'Clever-Constant_+200'};% "Random-Constant" "Clever-Constant_+15" "Clever-Constant_+50"
deca = "0.9";
time = 50;
 
for i=5:6
    figure
    clear c1 c2
    for j=1:5
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
y1(j,:)= [0 RMSE(attack_1,normal,time) RMSE(attack_2,normal,time) RMSE(attack_3,normal,time) RMSE(attack_4,normal,time) RMSE(attack_5,normal,time) RMSE(attack_6,normal,time)];
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

y2(j,:)= [0 RMSE(attack_1,normal,time) RMSE(attack_2,normal,time) RMSE(attack_3,normal,time) RMSE(attack_4,normal,time) RMSE(attack_5,normal,time) RMSE(attack_6,normal,time)];


    end
%% Multiple Runs Handling

fails2 = y2 == -10;

yt1 = y2(~fails2(:,2),2)

yt5 = y2(~fails2(:,5),5)



yf2(1) = 0;
yf2(2) = mean(yt1);
yf2(3) = mean(y2(~fails2(:,3),3));
yf2(4) = mean(y2(~fails2(:,4),4));
yf2(5) = mean(yt5);
yf2(6) = mean(y2(~fails2(:,6),6));
yf2(7) = mean(y2(~fails2(:,7),7));

fails2 = sum(fails2);

yf3(1) = 0;
yf3(2) = var(y2(~fails2(:,2),2));
yf3(3) = var(y2(~fails2(:,3),3));
yf3(4) = var(y2(~fails2(:,4),4));
yf3(5) = var(y2(~fails2(:,5),5));
yf3(6) = var(y2(~fails2(:,6),6));
yf3(7) = var(y2(~fails2(:,7),7));





%% Plotting

dx = 0.02;
dy = 0;
y1 = mean(y1);

scatter(x,y1,sz,'x');


hold on

scatter(x,yf2,sz);


for k =1:7
    s= num2str(fails2(k));
    w= num2str(yf3(k));
    s = strcat(s,'/5- ',w);
text(x(k)+dx,yf2(k)+dy,s,'Color','r')
end


xlabel('attackers to nodes ratio', 'FontSize', 24);
ylabel('root mean square error', 'FontSize', 24);
legend({'constant multiplier','variable multiplier'},'Location','northwest','FontSize',24);

if i~=1
    title = strcat('/home/nabegh/Bachelor/Results/Graphs/Continuous_Attack/Significantly_shifted_data/',num2str(time),'/',types(i),'_Decay_',strrep(deca,".","-"),'Decay-',deca,'-',cc{i});
   print(char(title) ,'-dpdf','-bestfit')
else 
    print(char(strcat('/home/nabegh/Bachelor/Results/Graphs/Continuous_Attack/Random_Attack/',num2str(time),'/Random_Attack_Decay_',strrep(deca,".","-"))),'-dpdf','-bestfit')
end

y1 = [];
y2 = [];
end