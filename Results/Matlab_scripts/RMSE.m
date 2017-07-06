function [ RMSE ] = RMSE( attack,normal)
normal = normal(2:end);
attack = attack(1:end);
RMSE = sqrt(mean((attack - normal).^2));
end


