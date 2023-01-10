import React, { useState, useEffect } from 'react';
import ArticleList from '../components/ArticleList';

const MainContainer = () => {
    
    const [articles, setArticles] = useState( [] )
    const [searchTerm, setSearchTerm] = useState("")

    useEffect(() => {
        fetch('https://hacker-news.firebaseio.com/v0/topstories.json')
            .then(res => res.json())
            .then(data => {
               const storyPromises = data.slice(0, 20).map(storyId => {
                    return fetch(`https://hacker-news.firebaseio.com/v0/item/${storyId}.json`)
                    .then(res => res.json())
                })

                Promise.all(storyPromises).then(data => setArticles(data))
            })
    }, [])


    const handleChange = function (event) {
        const userSearchTerm = event.target.value
        setSearchTerm(userSearchTerm)
    }

    const filteredArticles = articles.filter((article) => {
        return article.title.toLowerCase().includes(searchTerm.toLowerCase())
    })

    
    return (
            <div>
                <header className='header'>
                    <h1>Hacker News</h1>
                </header>
                        <div className='main-container'>
                <input id="search" className='search-box' placeholder="Search Posts" onChange={handleChange}></input>
                <ArticleList articles={ filteredArticles } />
                        </div>
            </div>
    )
}

export default MainContainer;