#!/usr/bin/python

FlagIn ='''114
114
114
111
99
107
110
114
110
48
49
49
51
114'''.strip().split('\n')

FlagOut = ''.join(map(chr,map(int,FlagIn)))
print("picoCTF{"+FlagOut+"}")
