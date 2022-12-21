import React from 'react';

const MusicItem = ({song, position}) =>{
    return (
    <li className='li'><div className='song-title'><span className='chart-number'>{position}</span> {song.title.label} </div>
    <div className='image-container'><img src={song['im:image'][2].label} /></div></li>
    )
}

export default MusicItem;