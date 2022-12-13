const assert = require('assert');
const Room = require('../room.js');

describe('Room', function(){
    let room;


    beforeEach(function(){
        room = new Room(10);
    });

    it('should have an area', function(){
        const actual = room.area;
        assert.strictEqual(actual, 10);
    });

    it('should not be painted to start', function(){
        const actual = room.isPainted;
        assert.strictEqual(actual, false);
    });

    it('should be able to be painted', function(){
        room.paint()
        const actual = room.isPainted;
        assert.strictEqual(actual, true)
    })
});