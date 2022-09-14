from flask import Flask, render_template, request, jsonify
app = Flask(__name__)

import requests
from bs4 import BeautifulSoup

from pymongo import MongoClient
client = MongoClient('mongodb+srv://test:sparta@cluster0.kafwra4.mongodb.net/Cluster0?retryWrites=true&w=majority')
db = client.dbsparta

headers = {'User-Agent' : 'Mozilla/5.0 (Windows NT 10.0; Win64; x64)AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36'}

@app.route('/')
def home():
    return render_template('index01.html')

@app.route('/gotoplace')
def gotoplace():
    # place_name = request.args.get('place_name')
    return render_template('index02.html')
@app.route("/trip_save", methods=["POST"])
def movie_post():
    url_receive = request.form['url_give']
    name_receive = request.form['name_give']

    data = requests.get(url_receive, headers=headers)

    soup = BeautifulSoup(data.text, 'html.parser')

    # title = soup.select_one('meta[property="og:title"]')['content'].split('여행')[0]
    img = soup.select_one('meta[property="og:image"]')['content']

    doc={
        'name': name_receive,
        'img': img
    }

    db.trip.insert_one(doc)

    return jsonify({'img':img})

@app.route("/trip_show", methods=["GET"])
def movie_get():
    all_place= list(db.trip.find({}, {'_id': False}))
    return jsonify({'places':all_place})

if __name__ == '__main__':
    app.run('0.0.0.0', port=5000, debug=True)