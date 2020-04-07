#!/usr/bin/python

alpha = ['a', 'b', 'c', 'd','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z', '{', '}']
FlagIn = [16,9,3,15,3,20,6,27,20,8,5,14,21,13,2,5,18,19,13,1,19,15,14,28]
FlagOut = ''
for x in FlagIn:
    FlagOut += alpha[x-1]

print(FlagOut.upper())
