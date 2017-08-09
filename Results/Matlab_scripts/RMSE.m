function [ RMSE ] = RMSE( attack,normal,len)
if length(normal)~=(length(attack)+1)
    RMSE = -10;
else
    normal = normal(2:1+len);
    attack = attack(1:len);
    RMSE = sqrt(mean((attack - normal).^2));
    %RMSE = mean(abs(attack-normal));
    
end
end


