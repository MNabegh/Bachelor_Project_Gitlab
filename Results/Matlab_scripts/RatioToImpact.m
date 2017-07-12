clc 
clear all
close all

%% Looping

types = ["Random-Constant" "Clever-Constant_+5" "Clever-Constant_+10" "Clever-Constant_+15" "Clever-Constant_+50" "Clever-Constant_+200"]; % "Random-Constant" "Clever-Constant_+15" "Clever-Constant_+50"
deca = "0.9";
 

for i=1:length(types)
%% Data Extracting 

normal = csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Decay_",deca,"/First/FinalDecision.csv"),1,0);
attack1_11 =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Decay_",deca,"/First/",types(i),"/FinalDecision1_11.csv"),1,0);
attack2_11 =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Decay_",deca,"/First/",types(i),"/FinalDecision2_11.csv"),1,0);
attack3_11 =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Decay_",deca,"/First/",types(i),"/FinalDecision3_11.csv"),1,0);
attack4_11 =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Decay_",deca,"/First/",types(i),"/FinalDecision4_11.csv"),1,0);
attack5_11 =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Decay_",deca,"/First/",types(i),"/FinalDecision5_11.csv"),1,0);
attack6_11 =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Decay_",deca,"/First/",types(i),"/FinalDecision6_11.csv"),1,0);

normal = transpose(normal(:,3));
attack_1=transpose(attack1_11(:,3));
attack_2=transpose(attack2_11(:,3));
attack_3=transpose(attack3_11(:,3));
attack_4=transpose(attack4_11(:,3));
attack_5=transpose(attack5_11(:,3));
attack_6=transpose(attack6_11(:,3));

%% RMSE
if i~=1
    figure
end
x= [0 1/11 2/11 3/11 4/11 5/11 6/11 ];
y1= [0 RMSE(attack_1,normal) RMSE(attack_2,normal) RMSE(attack_3,normal) RMSE(attack_4,normal) RMSE(attack_5,normal) RMSE(attack_6,normal)];
sz = 100;
scatter(x,y1,sz,'x');


%% Data Extracting 

normal = csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Decay_",deca,"/FinalDecision.csv"),1,0);
attack1_11 =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Decay_",deca,"/",types(i),"/FinalDecision1_11.csv"),1,0);
attack2_11 =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Decay_",deca,"/",types(i),"/FinalDecision2_11.csv"),1,0);
attack3_11 =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Decay_",deca,"/",types(i),"/FinalDecision3_11.csv"),1,0);
attack4_11 =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Decay_",deca,"/",types(i),"/FinalDecision4_11.csv"),1,0);
attack5_11 =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Decay_",deca,"/",types(i),"/FinalDecision5_11.csv"),1,0);
attack6_11 =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Decay_",deca,"/",types(i),"/FinalDecision6_11.csv"),1,0);

normal = transpose(normal(:,3));
attack_1=transpose(attack1_11(:,3));
attack_2=transpose(attack2_11(:,3));
attack_3=transpose(attack3_11(:,3));
attack_4=transpose(attack4_11(:,3));
attack_5=transpose(attack5_11(:,3));
attack_6=transpose(attack6_11(:,3));

%% RMSE

y2= [0 RMSE(attack_1,normal) RMSE(attack_2,normal) RMSE(attack_3,normal) RMSE(attack_4,normal) RMSE(attack_5,normal) RMSE(attack_6,normal)];

%% Plotting
hold on

scatter(x,y2,sz);
if i~=1
    title(strcat(strcat("Decay-",deca," "),types(i)));
else 
    title(types(i));
end
xlabel('attackers to nodes ratio');
ylabel('root mean square error');
legend({'constant multiplier','variable multiplier'},'Location','northwest','FontSize',24);



end