import React, { useState } from 'react';
import FilmList from '../components/FilmList';


const FilmBox = () => {
    
    const [films, setFilms] = useState([
        {
          id: 1,
          name: "Die Hard (1988)",
          url: "https://www.imdb.com/title/tt0095016/"
        },
        {
          id: 2,
          name: "Pulp Fiction (1994)",
          url: "https://www.imdb.com/title/tt0110912/?ref_=nv_sr_srsg_0"
        },
        {
          id: 3,
          name: "LOTR: The Two Towers(2002)",
          url: "https://www.imdb.com/title/tt0167261/?ref_=nv_sr_srsg_0"
        },
        {
          id: 4,
          name: "The Matrix (1999)", 
          url: "https://www.imdb.com/title/tt0133093/?ref_=nv_sr_srsg_0"
        },
        {
          id: 5,
          name: "Commando (1985)",
          url: "https://www.imdb.com/title/tt0088944/?ref_=nv_sr_srsg_0"
        }
    ]);

    return (
        <>
            <div class="main-box">
                <h1>Christmas Viewing List</h1>
                <FilmList films={films} />
                <a href="https://m.imdb.com/calendar/?region=gb"> Click to View Upcoming Releases</a>
                <p>(there is no point because everything is rubbish)</p>
            </div>
        </>
    )
}


export default FilmBox;