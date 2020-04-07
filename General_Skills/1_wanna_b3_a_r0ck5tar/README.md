# 1_wanna_b3-a-r0ck5tar

## Category
General Skills

## Points 
350

## Description
I wrote you another [song](https://2019shell1.picoctf.com/static/0690cdfc040e177175b2822f690ec4e0/lyrics.txt). Put the flag in the picoCTF{} flag format

## Solution
You can use [this site](https://codewithrockstar.com/online) to convert the file into workable numbers
However, first you must remove these lines

**If the music is a guitar                  
Say "Keep on rocking!"                
Listen to the rhythm
If the rhythm without Music is nothing
Else Whisper "That ain't it, Chief"**

to get rid of the need for input

Compile it to get the output

**66
79
78
74
79
86
73**

You can then use python to join and convert the characters with 

**''.join(map(chr,[66,79,78,74,79,86,73]))**

Then put the output in the Flag format for you flag.

[Solution Script](https://github.com/NDJSec/PicoCTF-2019-Writeup/blob/master/General_Skills/Warmed_Up/Solution.py)
