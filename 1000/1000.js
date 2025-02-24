import * as readline from 'node:readline/promises'
import { stdin , stdout } from 'node:process'

const rl = readline.createInterface({ input:stdin, output:stdout })

let input = await readLine();
input = input.split(' ');

let A = parseInt(input[0]);
let B = parseInt(input[1]);

console.log(A + B);

rl.close();

async function readLine(){
    return new Promise(resolve => {
        rl.once('line', line => {
            resolve(line);
        })
    });
}