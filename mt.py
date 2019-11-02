#!/usr/bin/env python
# -*- coding: utf-8 -*-
import requests
import json
import time
import hashlib
def get_shop():
    url = 'https://openapi.waimai.meituan.com/openapi/v1/poilist'
    headers = {
        'Content-Type': 'application/x-www-form-urlencoded'
    }
    longitude = 95369826
    latitude = 29735952
    sortType = 3
    app_id = 6715726628551684
    timestamp = time.localtime()
    str = url + '?' + 'app_id&latitude&longitude&sortType&timestamp' + 'b629da1242a84a7d8b47a6ee0333ee37'
    hl = hashlib.md5()
    hl.update(str.encode("utf-8"))
    sign = hl
    data = {
        'longitude': longitude,
        'latitude': latitude,
        'sortType': sortType,
        'app_id': app_id,
        'sign' : sign,
        'timestamp' : time.localtime()
    }
    r = requests.post(url, headers=headers, data=data)
    return r
r = get_shop()
print(r.text)
#  代码有问题……