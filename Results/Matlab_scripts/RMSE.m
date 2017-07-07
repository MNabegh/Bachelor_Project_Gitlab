function [ RMSE ] = RMSE( attack,normal)
if length(normal)~=(length(attack)+1)
    RMSE = -10;
else
    normal = normal(2:end);
    attack = attack(1:end);
    RMSE = sqrt(mean((attack - normal).^2));
    
end
end


