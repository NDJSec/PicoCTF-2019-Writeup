#!/usr/bin/python

import base64

base64Mes = 'bDNhcm5fdGgzX3IwcDM1'
Flag = base64.b64decode(base64Mes)
print("picoCTF{" + Flag + "}")
