clc 
clear all
close all

%% Choose a random date

month = randi([6,7]);

if month == 6
    day = randi([11,30]);

else day = randi([1,2]);
    
end 

display(month)
display(day);
    

    