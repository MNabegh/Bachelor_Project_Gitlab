close all
clear all
clc

%% Get data

    sensor1002=csvread(strcat("/home/nabegh/Bachelor/Results/Trust/1002.csv"),1,0);
    sensor1178=csvread(strcat("/home/nabegh/Bachelor/Results/Trust/1178.csv"),1,0);
    sensor1098=csvread(strcat("/home/nabegh/Bachelor/Results/Trust/1098.csv"),1,0);
    sensor2394=csvread(strcat("/home/nabegh/Bachelor/Results/Trust/2394.csv"),1,0);
    sensor255=csvread(strcat("/home/nabegh/Bachelor/Results/Trust/255.csv"),1,0);
    sensor481=csvread(strcat("/home/nabegh/Bachelor/Results/Trust/481.csv"),1,0);
    sensor1973=csvread(strcat("/home/nabegh/Bachelor/Results/Trust/1973.csv"),1,0);
    sensor1286=csvread(strcat("/home/nabegh/Bachelor/Results/Trust/1286.csv"),1,0);
    sensor1462=csvread(strcat("/home/nabegh/Bachelor/Results/Trust/1462.csv"),1,0);
    sensor2630=csvread(strcat("/home/nabegh/Bachelor/Results/Trust/2630.csv"),1,0);
    sensor3323=csvread(strcat("/home/nabegh/Bachelor/Results/Trust/3323.csv"),1,0);
    
    
    sensor1002=transpose(sensor1002(:,4));
    sensor1178=transpose(sensor1178(:,4));
    sensor1098=transpose(sensor1098(:,4));
    sensor2394=transpose(sensor2394(:,4));
    sensor255=transpose(sensor255(:,4));
    sensor481=transpose(sensor481(:,4));
    sensor1973=transpose(sensor1973(:,4));
    sensor1286=transpose(sensor1286(:,4));
    sensor1462=transpose(sensor1462(:,4));
    sensor2630=transpose(sensor2630(:,4));
    sensor3323=transpose(sensor3323(:,4));
    
    %%  Testing
    
    H =[];
    P=[];
    
    for i=1:50
        
        figure
        x=[ sensor1002(i) sensor1178(i) sensor2394(i) sensor1098(i) sensor255(i) sensor481(i) sensor1973(i) sensor1286(i) sensor1462(i) sensor2630(i) sensor3323(i)];
        x=transpose(x);
        x=sort(x);
        pd = fitdist(x,'Normal');
        [h,p] = kstest(x,'CDF',pd);
        H(i)=h;
        P(i)=p;
        [f,x_values] = ecdf(x);
        F = plot(x_values,f);
        set(F,'LineWidth',2);
        cdf_normal =cdf(pd,x);
       if i==43 || i==40
            hold on
        G =plot(x,cdf_normal,'LineWidth',2);
        end       
        lgd = legend('Empirical CDF','Fitted Normal Distribution CDF', 'Location','SE');
        lgd.FontSize = 24;
        title('Visual comparison between Emperical and Fitted distributions','FontSize',24)
    end
    
    display(H)
    display(P)
    mean(P)
    
    i=40;
    x=[ sensor1002(i) sensor1178(i) sensor2394(i) sensor1098(i) sensor255(i) sensor481(i) sensor1973(i) sensor1286(i) sensor1462(i)  sensor3323(i)]
    mean(x)