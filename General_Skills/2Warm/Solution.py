#1/usr/bin/python

def decimalToBinary(n):
    return bin(n).replace("0b", "")

if __name__ == '__main__':  
    Flag = decimalToBinary(42)
    print("picoCTF{"+str(Flag)+"}")
