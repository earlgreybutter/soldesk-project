import React from 'react';
import { makeStyles } from '@material-ui/core/styles';
import TextField from '@material-ui/core/TextField';

const useStyles = makeStyles((theme) => ({
  root: {
    '& .MuiTextField-root': {
      margin: theme.spacing(1),
      width: '125ch',
      
    },
  },
}));

export default function InputMulti() {
  const classes = useStyles();
  const [value, setValue] = React.useState('Controlled');

  const handleChange = (event) => {
    setValue(event.target.value);
  };

  return (
    <form className={classes.root} noValidate autoComplete="off">
    
      <div>
       
        <TextField
          id="outlined-multiline-static"
          label="Multiline"
          multiline
          rows={15}
          defaultValue="Default Value"
          variant="outlined"
        />
      </div>
    </form>
  );
}
