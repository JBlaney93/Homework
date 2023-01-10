import ArticleItem from "./ArticleItem"

const ArticleList = ( {articles} ) => {
    
    const articleItems = articles.map((article, index) => {
        return <ArticleItem article={article.title} key={index} url={article.url} 
                postedBy={article.by} score={article.score}/>
    })

    return (
        <div>
            {articleItems}
        </div>
    )
}

export default ArticleList;