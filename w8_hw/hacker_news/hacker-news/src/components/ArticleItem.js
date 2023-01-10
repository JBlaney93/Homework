const ArticleItem = ( {article, url, postedBy, score, kids} ) => {

    return (
        <div className="article">
            <a href={url} className="article__title">{article}</a>
            <div className="article-sub">
                <p className="article__comments">posted by {postedBy}</p>
                <p className="article__user">score {score}</p>
            </div>
        </div>
    )
}

export default ArticleItem;