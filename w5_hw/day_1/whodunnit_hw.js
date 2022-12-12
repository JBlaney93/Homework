// EPISODE 1

// const scenario = {
//     murderer: 'Miss Scarlet',
//     room: 'Library',
//     weapon: 'Rope'
//   };
  
//   const declareMurderer = function() {
//     return `The murderer is ${scenario.murderer}.`;
//   }
  
//   const verdict = declareMurderer();
//   console.log(verdict);

//   This will return the string 'The murderer is Miss Scarlet'


// EPISODE 2

// const murderer = 'Professor Plum';

// const changeMurderer = function() {
//   murderer = 'Mrs. Peacock';
// }

// const declareMurderer = function() {
//   return `The murderer is ${murderer}.`;
// }

// changeMurderer();
// const verdict = declareMurderer();
// console.log(verdict);

// This will change murderer from Plum to Peacock
// This will return the string ' The murderer is Mrs. Peacock'

// **EDIT** okay I misunderstood this completely and after moving on to the next example and reading up
// about let and const online I see now that this will return an error as we cannot reassign a const

/*
// EPISODE 3

let murderer = 'Professor Plum';

const declareMurderer = function() {
  let murderer = 'Mrs. Peacock';
  return `The murderer is ${murderer}.`;
}

// this instance of let murderer only exists INSIDE this function due to the scope of let

const firstVerdict = declareMurderer();
console.log('First Verdict: ', firstVerdict);

// this will return Mrs. Peacock as that is calling the let murderer from within this function

const secondVerdict = `The murderer is ${murderer}.`;
console.log('Second Verdict: ', secondVerdict);

// this will return Professor Plum as murder as this was declared globally 
*/


/*
// EPISODE 4

let suspectOne = 'Miss Scarlet';
let suspectTwo = 'Professor Plum';
let suspectThree = 'Mrs. Peacock';

const declareAllSuspects = function() {
  let suspectThree = 'Colonel Mustard';
  return `The suspects are ${suspectOne}, ${suspectTwo}, ${suspectThree}.`;
}

// so similarly to above I think this will return Colonel Mustard as suspect 3 due to that being inside the function

const suspects = declareAllSuspects();
console.log(suspects);
// this will return Miss Scarlet, Professor Plum and Colonel Mustard

console.log(`Suspect three is ${suspectThree}.`);
// this will return Mrs Peacock as this refers to the globally declared suspectThree, not the one declared inside the function
*/ 

/*
// EPISODE 5

const scenario = {
    murderer: 'Miss Scarlet',
    room: 'Kitchen',
    weapon: 'Candle Stick'
  };
  
  const changeWeapon = function(newWeapon) {
    scenario.weapon = newWeapon;
  }
  
  const declareWeapon = function() {
    return `The weapon is the ${scenario.weapon}.`;
  }
  
  changeWeapon('Revolver');
  const verdict = declareWeapon();
  console.log(verdict);

// this will print 'The weapon is the Revolver
// even though the scenario is a const, we can still change the properties of the object
*/

/*
// EPISODE 6

let murderer = 'Colonel Mustard';

const changeMurderer = function() {
  murderer = 'Mr. Green';

  const plotTwist = function() {
    murderer = 'Mrs. White';
  }

  plotTwist();
}

const declareMurderer = function () {
  return `The murderer is ${murderer}.`;
}

changeMurderer();
const verdict = declareMurderer();
console.log(verdict);

// I think that this will either throw an error OR the murderer
// will still be 'Colonel Mustard'

// I ran the code to check and I see that it returns Mrs. White
// Is this because we are not actually referencing the let murder = 'Colonel Mustard',
// we are only referecning the murderer declared within the functions? not 100% sure about this one
*/

/*
// EPISODE 7

let murderer = 'Professor Plum';
// okay I undertand that this is a red herring

const changeMurderer = function() {
  murderer = 'Mr. Green';

  const plotTwist = function() {
    let murderer = 'Colonel Mustard';
// is there any significance to let being used here but not in the other two functions???
    const unexpectedOutcome = function() {
      murderer = 'Miss Scarlet';
    }

    unexpectedOutcome();
  }

  plotTwist();
}

// I do not understand what is going on inside this function

const declareMurderer = function() {
  return `The murderer is ${murderer}.`;
}

changeMurderer();
const verdict = declareMurderer();
console.log(verdict);

// I was expecting the murderer to be 'Colonel Mustard'
// My guess was that inside the function, Green is declared murderer, then unexpectedOutcome()
// would make murderer = Scarlet, then plotTwist() would make murderer = Mustard
// I can see that the answer is Mr Green

// I do not understand why, I can't wrap my head around what is going on inside the function
*/

/*
// EPISODE 8 

const scenario = {
    murderer: 'Mrs. Peacock',
    room: 'Conservatory',
    weapon: 'Lead Pipe'
  };
  
  const changeScenario = function() {
    scenario.murderer = 'Mrs. Peacock';
    scenario.room = 'Dining Room';
  
    const plotTwist = function(room) {
      if (scenario.room === room) {
        scenario.murderer = 'Colonel Mustard';
      }
  
      const unexpectedOutcome = function(murderer) {
        if (scenario.murderer === murderer) {
          scenario.weapon = 'Candle Stick';
        }
      }
  
      unexpectedOutcome('Colonel Mustard');
    }
  
    plotTwist('Dining Room');
  }
  
  const declareWeapon = function() {
    return `The weapon is ${scenario.weapon}.`
  }
  
  changeScenario();
  const verdict = declareWeapon();
  console.log(verdict);

// weapon is Candle Stick?

// after running the code I have got the right answer but I cannot 
// confidently explain why. need to go over this one in class
*/

/*
// EPISODE 9 

let murderer = 'Professor Plum';

if (murderer === 'Professor Plum') {
  let murderer = 'Mrs. Peacock';
}

const declareMurderer = function() {
  return `The murderer is ${murderer}.`;
}

const verdict = declareMurderer();
console.log(verdict);

// Still Professor Plum?
// We can't reassign a let value?
*/ 