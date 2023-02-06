function createPhoneNumber(numbers) {
    // Please complete the function in order to satisfy the tests

    return (`(${numbers[0]}${numbers[1]}${numbers[2]}) ${numbers[3]}${numbers[4]}${numbers[5]}-${numbers[6]}${numbers[7]}${numbers[8]}${numbers[9]}`
        )
    
       
    }

    console.log(createPhoneNumber([1, 2, 3, 4, 5, 6, 7, 8, 9, 0]))
    
module.exports = createPhoneNumber;



    // return (
    //     `(${numbers.slice(0,3)}) ${numbers.slice(3,6)}-${numbers.slice(6,10)}`
    //     )