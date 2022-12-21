import React, {useState, useEffect} from 'react'
import MusicList from '../components/MusicList';

const MusicChartContainer = () => {
    const [topSongs, setTopSongs] = useState([]);
    
    useEffect(() => {
        getTopSongs();
      }, [])


    const getTopSongs = function() {
        fetch('https://itunes.apple.com/gb/rss/topsongs/limit=20/json')
        .then(results => results.json())
        .then(topSongs => setTopSongs(topSongs.feed.entry))
    }
    


    return (
        <div className="list-container">
        <MusicList topSongs={topSongs}/>
        </div>
    )

}


export default MusicChartContainer;