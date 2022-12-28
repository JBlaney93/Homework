
const ArticleItem = ({ post, permalink, url, upVotes, comments}) => {

    return (
        <div className="article-item">
            <h2 className="article-item-header">{post}</h2>
            <div>Up Votes: {upVotes}</div>
            <div>Number of Comments: {comments}</div>
            <div><a href={"https://www.reddit.com"+permalink}>Link to Reddit Thread</a></div>
            <div><a href={url}>Link to Article</a></div>
        </div>
    )
}

export default ArticleItem;