function [ RMSE ] = RMSE( attack,normal,startp,endp,varargin )
if nargin==2
    startp=0;
    endp=length(attack)-1;
end
m=length(normal)-length(attack)+1;
normal = normal(m+startp:m+endp);
attack = attack(1+startp:1+endp);
RMSE = sqrt(mean((attack - normal).^2));
end


