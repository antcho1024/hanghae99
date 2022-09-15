import requests
from bs4 import BeautifulSoup

headers = {'User-Agent' : 'Mozilla/5.0 (Windows NT 10.0; Win64; x64)AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36'}
url="https://travel.naver.com/domestic/01150/summary?seasonIndex=4"
data = requests.get(url, headers=headers)

soup = BeautifulSoup(data.text, 'html.parser')

title = soup.select_one('meta[property="og:title"]')['content'].split('여행')[0]
img = soup.select_one('meta[property="og:image"]')['content']
desc = soup.select_one('meta[property="og:description"]')['content']

# print(title, img, desc)

a= soup.select_one('#__next > div > div.mainContainer_container__1GEbx > div > div.card_Card__2ZMIR > div.scrollBox_ScrollBox__3pY9k.poi_Poi_filteredPoi__1u-8s.scrollBox_Poi_filteredPoi__2-5ja > div.scrollBox_scroll__3f5_d > ul > li.scrollBox_ScrollBoxItem__VUVGT.scrollBox_as_first__2c2gW > div > a > div > span')
print(a['content'])