let input = require('fs').readFileSync('/dev/stdin').toString().split('\n');
let N = Number(input[0].split(' ')[0]);
let X = Number(input[0].split(' ')[1]);
let A = input[1].split(' ');
let result = [];

for (let i = 0; i < N; i++) {
    if (A[i] < X) {
        result.push(A[i]);
    }
}

console.log(result.join(' '));