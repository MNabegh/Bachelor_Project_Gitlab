function [ RMSE ] = RMSE2( attack,normal, period, frequency)

    normal = normal(period+1:frequency:length(attack)+1);
    attack = attack(period:frequency:end);
    RMSE = sqrt(mean((attack - normal).^2));
    
end


