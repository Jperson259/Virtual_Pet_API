const endpoints = [
   

    'https://localhost:8822/api/pets/',
    'https://localhost:8822/api/pets/1',
    'https://localhost:8822/api/pets/2',
    'https://localhost:8822/api/pets/3'

]
const onSuccess = response => {
   console.log(response) 
}
const onFailure = error => {
    console.log(error)
}

console.log('initiating test...')
endpoints.forEach(request => {
    fetch(request).then(onSuccess).catch(onFailure)
})
console.log('all done!')