# Logon

## Category
Web

## Points 
100

## Description
The factory is hiding things from all of its users. Can you login as logon and find what they've been looking at? https://2019shell1.picoctf.com/problem/21895/ ([link](https://2019shell1.picoctf.com/problem/21895/)) or http://2019shell1.picoctf.com:21895

## Solution
This problem uses a data type in web severs called cookies

To solve this problem will want to go the website and login with the username admin and the password admin

Once in you will want to modify the cookies of the page, specifically the admin cookie and change the value from False to True

Then reload the website to see your flag

**To edit the cookie you can either use a tool for Chrome called EditThisCookie 
**This call also be done with developer tools in Chrome and Firefox

(How to use Developer Tools: Chrome)(https://developers.google.com/web/tools/chrome-devtools/storage/cookies)


