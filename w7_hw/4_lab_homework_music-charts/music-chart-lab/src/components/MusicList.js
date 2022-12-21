import React from 'react';
import MusicItem from './MusicItem';
 
const MusicList = ({ topSongs }) => {
    const topSongItems = topSongs.map((song, index) => {
        return <MusicItem song={song} key={index} position={index+1}/>
        // return <li>{song.title.label}</li>
    })

    return (
       <ul className='ul'>
        {topSongItems}
       </ul>
    )
 }

 export default MusicList;