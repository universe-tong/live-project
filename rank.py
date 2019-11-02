# -*- coding:utf-8 -*-
#查看福州实时最拥堵的商圈  0,1,2,3,4,5代表序号，经纬度，商圈名，拥堵指数，旅行速度，商圈拥堵排名，若excel乱码用记事本打开
#资料来源https://report.amap.com/detail.do?city=350100，5分钟刷新一次
import pandas as pd
import time
import requests


t = time.strftime("%H%M%S", time.localtime())
r = requests.get("http://report.amap.com/ajax/districtRank.do?linksType=3&cityCode=350100")
s = r.json()
a = []
for i in range(len(s)):
    for j in range(len(s[i]['coords'][0][0])):
        a.append([s[i]['coords'][0][0][j]['lon'], s[i]['coords'][0][0][j]['lat'], s[i]['name'], s[i]['index'],
                  s[i]['speed'], s[i]['number']])
c = pd.DataFrame(a)
c.to_csv(t + 'new.csv')
