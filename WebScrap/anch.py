from bs4 import BeautifulSoup

file=open('data.txt',"r")
data=file.read()
file.close()

soup = BeautifulSoup(data)

for div in soup.findAll('div', attrs={'class':'image'}):
    print(div.find('a')['href'])
