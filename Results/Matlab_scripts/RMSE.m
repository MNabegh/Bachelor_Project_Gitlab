function [ RMSE ] = RMSE( attack,normal,startp,endp,varargin )
normal = normal(end-length(attack)+1:end);
attack = attack(1:end);
RMSE = sqrt(mean((attack - normal).^2));
end


