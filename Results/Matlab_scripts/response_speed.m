close all
clear alll
clc

%% Looping


%% Data Extracting

deca = "0.6";
types = [ "Clever-Constant_+5" "Clever-Constant_+10" "Clever-Constant_+15"];

for j= 1:length(types)
    figure
attacker_node =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Track/Decay_",deca,"/", types(j),"/1098.csv"),1,0);
honest_node =    csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Track/Decay_",deca,"/", types(j),"/1002.csv"),1,0);

Final_attack =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Track/Decay_",deca,"/", types(j),"/FinalDecision4_11.csv"),1,0);
Final_honesty =  csvread(strcat("/home/nabegh/Bachelor/Results/FinalDecision/Track/Decay_",deca,"/FinalDecision.csv"),1,0);

%% Draw RMSE vs time

Final_attack_Reading  = transpose(Final_attack(:,3));
Final_honesty_Reading = transpose(Final_honesty(:,3));

RMSError = zeros(1,length(Final_attack_Reading));

for i = 1:length(Final_attack_Reading)
    RMSError(i) = RMSE(Final_attack_Reading, Final_honesty_Reading, i);
end


figures(1) = plot([0 RMSError]);
xlabel('time in hours')
ylabel('RMSE')
tit =  strcat('/home/nabegh/Bachelor/Results/Graphs/Continuous_Attack/Marginally_shifted_data/Response_Speed/Decay',strrep(deca,".","-") , types(j),"Readings");
print(char(tit),'-dpdf','-bestfit')


%% Draw Final opinion
figure

Final_attack_Opinion  = transpose(Final_attack(:,4));
Final_honesty_Opinion = transpose(Final_honesty(:,4));

attacker_node  = transpose(attacker_node(end-52:end,5));
honest_node = transpose(honest_node(end-52:end,5));


plot( Final_attack_Opinion)
hold on
figures(2) = plot( Final_honesty_Opinion);
xlabel('time in hours')
ylabel('Beleif')
hold on
plot(attacker_node)
hold on
plot(honest_node)

thre = ones(1,53).*0.1;
plot(thre,'--k')


legend('Attackers present', 'Attackers absent', 'Attacker node', 'Honest node')
tit = strcat('/home/nabegh/Bachelor/Results/Graphs/Continuous_Attack/Marginally_shifted_data/Response_Speed/Decay',strrep(deca,".","-") , types(j),"Opinions");
print( char(tit),'-dpdf','-bestfit')
end

